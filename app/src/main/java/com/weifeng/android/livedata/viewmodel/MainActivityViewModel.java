package com.weifeng.android.livedata.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @anthor weifeng
 * @time 2020-03-03 17:24
 */
public class MainActivityViewModel extends ViewModel {
    MutableLiveData<Integer> clickNumLiveData = new MutableLiveData<>();

    public void addClickNum(){
        clickNumLiveData.setValue(clickNumLiveData.getValue() == null ? 1 : clickNumLiveData.getValue()+1);
    }


    public MutableLiveData<Integer> getClickNumLiveData() {
        return clickNumLiveData;
    }
}
