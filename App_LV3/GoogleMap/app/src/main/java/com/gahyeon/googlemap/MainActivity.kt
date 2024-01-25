package com.gahyeon.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mGoogleMap: GoogleMap

    // 위치 서비스가 gps를 사용해서 위치를 확인
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    // 위치 값 요청에 대한 갱신 정보를 받는 변수
    lateinit var locationCallback: LocationCallback

    // permission 추가
    lateinit var locationPermission: ActivityResultLauncher<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // permission이 있는지 확인
        locationPermission = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()) {results ->
            if (results.all{it.value}) {  // 모든 permission을 가지고 있을 때
                (supportFragmentManager.findFragmentById(R.id.mapView) as SupportMapFragment)!!.getMapAsync(this)  // mapView(fragment)와 연결시키 -> 위에서 상속받은 OnMapReadyCallback에 의해 map이 준비되면 밑의 onMapReady가 자동으로 콜백됨.
            } else { // 문제가 발생했을 때
                Toast.makeText(this, "권한 승인이 필요합니다.", Toast.LENGTH_SHORT).show()
            }

        }
    }

    // 지도 객체를 이용할 수 있는 상황이 될 때
    override fun onMapReady(p0: GoogleMap) {
        TODO("Not yet implemented")
    }
}