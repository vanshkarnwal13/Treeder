package com.brocode.carbon_footprint_app.repositories;

import android.bluetooth.le.AdvertiseData;

import androidx.lifecycle.MutableLiveData;

import com.brocode.carbon_footprint_app.R;
import com.brocode.carbon_footprint_app.models.Tree;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class TreeRepository {

    private static TreeRepository instance;
    private ArrayList<Tree> dataSet = new ArrayList<>();

    public static TreeRepository getInstance(){
        if(instance == null){
            instance = new TreeRepository();
        }
        return instance;
    }

    public MutableLiveData<List<Tree>> getTrees(){
        setTrees();
        MutableLiveData<List<Tree>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setTrees(){
        dataSet.add(new Tree("Bob", 60, 6, String.valueOf(R.drawable.tree1),new LatLng(130, 130)));
        dataSet.add(new Tree("Max", 70, 7, String.valueOf(R.drawable.tree2),new LatLng(130, 130)));
        dataSet.add(new Tree("Bro", 80, 8, String.valueOf(R.drawable.tree3),new LatLng(130, 130)));
    }
}