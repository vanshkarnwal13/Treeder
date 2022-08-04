package com.brocode.carbon_footprint_app.viewmodels;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.brocode.carbon_footprint_app.models.Tree;
import com.brocode.carbon_footprint_app.repositories.TreeRepository;

import java.util.List;

public class TreeViewModel extends ViewModel {

    private MutableLiveData<List<Tree>> mTrees;
    private TreeRepository mRepo;

    public void init(){
        if(mTrees != null){
            return;
        }
        mRepo = TreeRepository.getInstance();
        mTrees = mRepo.getTrees();
    }

    public LiveData<List<Tree>> getTrees(){
        return mTrees;
    }
}

