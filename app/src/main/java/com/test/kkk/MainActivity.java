package com.test.kkk;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.test.net.ApiManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {


	@BindView(R.id.tv_print)
	TextView tv_print;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

	}


	public void test(View view) {

		ApiManager apiManager = ApiManager.getInstence();
		Call<String> call = apiManager.getDailyService().getZhihuDailyRetrofitOnly();
		//发送异步请求
		call.enqueue(new Callback<String>() {
			@Override
			public void onResponse(Call<String> call, Response<String> response) {
//				eventLister.onSuccess(response.body().getStories());
				Log.e("hanshunli","han");
				tv_print.setText("22222"+response.body());
			}

			@Override
			public void onFailure(Call<String> call, Throwable t) {
//				eventLister.onFail(t.getMessage(), "");
				Log.e("hanshunli","han1111");
				Log.e("han",t.toString());
//				Log.e("han",call.request().body().toString());

			}
		});
	}
}