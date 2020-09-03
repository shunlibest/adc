package com.test.net;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

	//单纯使用retrofit接口定义
	@GET("test")
	Call<String> getZhihuDailyRetrofitOnly();
//	@Query("name") String name
	//使用retrofit+RxAndroid的接口定义
//	@GET("news/latest")
//	Observable<String> getZhihuDaily();
}