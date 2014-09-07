package com.example.retrofitexemplo.adapters;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.retrofitexemplo.R;
import com.example.retrofitexemplo.pojos.Reclamacao;

public class ListReclamacaoAdapter extends ArrayAdapter<Reclamacao>{
	
	private List<Reclamacao> reclamacoes = new ArrayList<Reclamacao>();
	private LayoutInflater inflater;

	public ListReclamacaoAdapter(Context context, int resource,
			List<Reclamacao> reclamacoes) {
		super(context, resource, reclamacoes);
		
		this.reclamacoes = reclamacoes;
		
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		Reclamacao reclamacao = reclamacoes.get(position);
		TextView tvDesc;
		TextView tvEndereco;

		if (convertView == null) {

			convertView = inflater.inflate(R.layout.itemlist_reclamacoes, null);
			tvDesc = (TextView) convertView.findViewById(R.id.tvDesc);
			tvEndereco = (TextView) convertView.findViewById(R.id.tvEndereco);

			
			EventosHolder evHolder = new EventosHolder();
			evHolder.tvDesc = tvDesc;
			evHolder.tvEndereco = tvEndereco;

			convertView.setTag(evHolder);
		} else {
			EventosHolder evHolder = (EventosHolder) convertView.getTag();
			tvDesc = evHolder.tvDesc ;
			tvEndereco = evHolder.tvEndereco;
		}

		tvDesc.setText(reclamacao.getDescricao());
		tvEndereco.setText(reclamacao.getEndereco());
		return convertView;
	
	}

	//Subclasse responsável por manter a referência dos objetos
	public class EventosHolder{
		
		public TextView tvDesc;
		public TextView tvEndereco;
		
	}

}
