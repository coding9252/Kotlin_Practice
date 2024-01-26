package com.gahyeon.miseya.retrofit

import com.gahyeon.miseya.data.Dust
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface NetWorkInterface {
    @GET("getCtprvnRltmMesureDnsty")  //시도별 실시간 측정정보 요청 주소 뒷부분
    suspend fun getDust(@QueryMap param: HashMap<String, String>): Dust  // 파라미터에 HashMap컬렉션 타입으로 <> 안에 요청변수들(serviceKey, returnType 등)을 키와 value로 2개가 들어감. -> 요청하면 Dust를 리턴받음.
}