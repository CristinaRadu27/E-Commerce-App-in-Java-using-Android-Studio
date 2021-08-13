package com.example1.ecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example1.ecommerceapp.R;
import com.example1.ecommerceapp.model.ProductCategory;

import java.util.List;

public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder> {

    Context context;
    List<ProductCategory> productCategoryList;
    private boolean attachToRoot;

    public ProductCategoryAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.categoryName.setText(productCategoryList.get(position).getProductName())

    }

    @NonNull
    @Override
    public ProductAdapter.productViewHolder onCreateViewHolder() {
        return onCreateViewHolder(, );
    }

    @NonNull
    @Override
    public ProductAdapter.productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.productViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView categoryName;

        public ProductViewHolder(@NonNull View itemView){
            super(itemView);

            categoryName= itemView.findViewById(R.id.cat_name)
        }
    }
}
