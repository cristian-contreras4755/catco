package com.example.usuario.idsiapp.Common;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;

public class Geolozalizacion extends Service implements LocationListener {

    private  Context context;


    public Geolozalizacion() {
        super();
        //this.context = this.;
    }



    public Geolozalizacion(Context context) {
        super();
        this.context = context;
    }




    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

            switch (status){


            }


    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}





