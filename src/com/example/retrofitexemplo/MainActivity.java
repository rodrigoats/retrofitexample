package com.example.retrofitexemplo;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.retrofitexemplo.adapters.ListReclamacaoAdapter;
import com.example.retrofitexemplo.pojos.Reclamacao;

public class MainActivity extends ActionBarActivity {
	
	
	private ListReclamacaoAdapter adapter;
	private ListView lvReclamacoes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(
				"http://www.cidadereclama.com.br").build();

		RetrofitApi retrofitApi = restAdapter.create(RetrofitApi.class);
		
		lvReclamacoes = (ListView) findViewById(R.id.lvReclamacoes);

		retrofitApi.getReclamacoes(new Callback<List<Reclamacao>>() {

			@Override
			public void failure(RetrofitError arg0) {
				
			}

			@Override
			public void success(List<Reclamacao> reclamacoes, Response resp) {
				
				adapter = new ListReclamacaoAdapter(MainActivity.this,
						R.layout.itemlist_reclamacoes, reclamacoes);
				
				lvReclamacoes.setAdapter(adapter);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public interface RetrofitApi{
		
		@GET("/api/reclamacoes/")
		void getReclamacoes(Callback<List<Reclamacao>> callback);
	}
}
