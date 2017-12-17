package edu.upc.eetac.dsa.themovieapp2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import edu.upc.eetac.dsa.themovieapp2.R;
import retrofit2.Retrofit;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

    // insert your themoviedb.org API KEY here
    private final static String API_KEY = "e1685b58286df09a7f6c6a34a5819f26";
    public String query;
    List<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
