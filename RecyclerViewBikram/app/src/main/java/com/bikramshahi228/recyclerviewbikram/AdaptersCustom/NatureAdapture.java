package com.bikramshahi228.recyclerviewbikram.AdaptersCustom;
// this is the custom adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bikramshahi228.recyclerviewbikram.Model.NatureModel;
import com.bikramshahi228.recyclerviewbikram.R;

import java.util.ArrayList;


public class NatureAdapture extends RecyclerView.Adapter<NatureAdapture.viewAdapter> {
    ArrayList<NatureModel> list;
    Context context;

    public NatureAdapture(ArrayList<NatureModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout, parent, false);

        return new viewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewAdapter holder, int position) {
        NatureModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

    /*    holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Item is clicked",Toast.LENGTH_SHORT).show();
            }
        });
   */
          // onclick listener and it tells that which image is clicked
switch (position){
    case 0:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(context,"First image is clicked",Toast.LENGTH_SHORT).show();




            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your own text",Toast.LENGTH_SHORT).show();
            }
        });
         break;
    case 1:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 2:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
        case 3:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 4:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 5:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 6:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 7:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 8:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
    case 9:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Second image is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Add your Desired text",Toast.LENGTH_SHORT).show();
            }
        });
}

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewAdapter extends RecyclerView.ViewHolder {
        ImageView imageView;

        // Analyze where we have used findView by id;

        TextView textView;

        public viewAdapter(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
