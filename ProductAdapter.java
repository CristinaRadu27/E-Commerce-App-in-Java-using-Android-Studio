package com.example1.ecommerceapp.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example1.ecommerceapp.Productdetails;
import com.example1.ecommerceapp.R;
import com.example1.ecommerceapp.model.Products;

import java.util.List;

public class ProductAdapter  extends  RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    Context context;
    List<Products> productsList;

    public ProductAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_products_row_item, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter holder, int position) {

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        holder.prodImage.setImageResource(productsList.get(position).getImageUrl());
        holder.prodName.setText(productsList.get(position).getProductName());
        holder.prodQuantity.setText(productsList.get(position).getProductQuantity());
        holder.prodPrice.setText(productsList.get(position).getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i= new Intent(context, Productdetails.class);

                Pair[] pairs= new Pair[];
                pairs[0]= new Pair<View,String>(holder.prodImage, "image");
                ActivityOptions activityOptions=ActivityOptions.makeSceneTransitionAnimation(context,pairs);
                context.startActivity(i,activityOptions.toBundle());
            }
        };
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView prodImage;
        TextView prodName, prodQuantity, prodPrice;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            prodImage=itemView.findViewById((R.id.prod_image);
            prodName=itemView.findViewById(R.id.prod_name);
            prodPrice=itemView.findViewById(R.id.prod_price);
            prodQuantity=itemView.findViewById(R.id.prod_quntity);


        }
    }
}
