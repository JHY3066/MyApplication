package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends Activity {
    MapView mapView1;
    RelativeLayout mapViewContainer1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mapView1 = new MapView(this);

        mapViewContainer1 = (RelativeLayout) findViewById(R.id.map_view);
        mapViewContainer1.addView(mapView1);

        mapView1.setMapCenterPoint(MapPoint.mapPointWithCONGCoord(35.889209, 128.610470), true);
        mapView1.setZoomLevel(1, true);
        mapView1.zoomIn(true);
        mapView1.zoomOut(true);

        MapPoint MARKER_POINT1 = MapPoint.mapPointWithCONGCoord(35.889209, 128.610470);
        MapPOIItem marker1 = new MapPOIItem();
        marker1.setTag(0);
        marker1.setMarkerType(MapPOIItem.MarkerType.RedPin);
        mapView1.addPOIItem(marker1);

    }
}

