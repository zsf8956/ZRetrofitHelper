package com.zsf.zretrofitlib.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.zsf.zretrofitlib.R;

/**
 * 网络加载进度提示
 */
public class LoadingProgress extends Dialog implements DialogInterface.OnCancelListener{

    public LoadingProgress(Context context) {
        super(context, R.style.dialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_loading_progress);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(this);
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        cancel();
    }
}
