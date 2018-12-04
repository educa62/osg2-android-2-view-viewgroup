package id.osg.android_viewviewgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDaftar(View view) {
        //untuk pindah halaman ke form pendaftaran
        Intent intent = new Intent(this, FormDaftarActivity.class);
        startActivity(intent);
    }

    public void onClickLogin(View view) {
//        untuk aksi klik tombol login
    }
}
