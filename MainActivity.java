package com.example1.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example1.ecommerceapp.adapter.ProductAdapter;
import com.example1.ecommerceapp.adapter.ProductCategoryAdapter;
import com.example1.ecommerceapp.model.ProductCategory;
import com.example1.ecommerceapp.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 ProductCategoryAdapter productCategoryAdapter;
 RecyclerView productCatRecycler, prodItemRecycler;
 ProductAdapter productAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All Body Products"));
        productCategoryList.add(new ProductCategory(3,"Skincare"));
        productCategoryList.add(new ProductCategory(4,"Hair"));

        setProductRecycler(productCategoryList);

        List<Products> productsList= new ArrayList<>();

        productsList.add(new Products(1,"Japanese Cheery Blossom Set Body Mist+ Body Cream", "250g", "30$",R.drawable.creams2 ));
        productsList.add(new Products(2,"Tom Ford Spray", "100ml", "50$",R.drawable.bodyspray ));
        productsList.add(new Products(3,"Whipped Body Cream", "236ml", "25$",R.drawable.product2 ));
        productsList.add(new Products(4,"Tea Tree Body Wash", "300ml", "40$",R.drawable.product1 ));
        productsList.add(new Products(5,"Mac Foundation", "30ml", "50$",R.drawable.foundation ));
        productsList.add(new Products(6,"Chanel Perfume:Alure", "100ml", "100$",R.drawable.perfume ));
        productsList.add(new Products(7,"NativeChils Hair Mist", "50ml", "20$",R.drawable.hairmist));
        productsList.add(new Products(8,"Nivea Sunscreen", "250g", "20$",R.drawable.nivea));

        setProdItemRecycler(productsList);

    }

    private void setProdItemRecycler(List<Products> productsList) {
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){
        View productCatRecycler = findViewById(R.id.product_recycler);

        RecyclerView.LayoutManager layoutManager= new RecyclerView.LayoutManager(this, RecyclerView.HORIZONTAL, false) {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        };
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter =new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }

    private void setProductItemRecycler(List<Products> productCategoryList){
        View productItemRecycler = findViewById(R.id.product_recycler);

        RecyclerView.LayoutManager layoutManager= new RecyclerView.LayoutManager(this, RecyclerView.HORIZONTAL, false) {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        };
        productItemRecycler.setLayoutManager(layoutManager);
        productAdapter =new ProductAdapter(this, productsList);
        productItemRecycler.setAdapter(productCategoryAdapter);

    }
}