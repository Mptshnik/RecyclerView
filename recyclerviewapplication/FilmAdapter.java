package com.example.recyclerviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder>
{
    private LayoutInflater _layoutInflater;
    private List<Film> _films;

    public FilmAdapter(Context context, List<Film> films)
    {
        _layoutInflater = LayoutInflater.from(context);
        _films = films;
    }

    @NonNull
    @Override
    public FilmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = _layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.ViewHolder holder, int position)
    {
        Film film = _films.get(position);
        holder._image.setImageResource(film.getResourceFlag());
        holder._filmName.setText(film.getName());
    }

    @Override
    public int getItemCount() {
        return _films.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView _image;
        private TextView _filmName;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            _image = itemView.findViewById(R.id.Image);
            _filmName = itemView.findViewById(R.id.FilmName);
        }
    }
}
