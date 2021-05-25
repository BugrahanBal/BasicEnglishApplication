package co.example.basicenglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import co.example.basicenglish.mic.Mic;
import co.example.basicenglish.test.QuizActivity;

public class MainActivity extends AppCompatActivity {

    private View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,
                R.id.navigation_vocabulary,
                R.id.navigation_pronunciation,
                R.id.navigation_sentence)
                .build();
        // bottom menu idleri dikkat et !!

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        //Nav controller kısmı sabit kalsın
        ///sonra set up yap appbnar yazmadan 2  parametre yaz sadece
        //3.adımm ( yukarıda 2. fragmenta gecince geri oku cıkacak....
        /*
        override fun onSupportNavigateUP...return NavigationUI.navigatep(navController,null)
        * */




      /*if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }*/




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.top_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menu) {

        switch (menu.getItemId()) {

            case R.id.test:
                Intent testegit =new Intent(getApplicationContext(),QuizActivity.class);
                startActivity(testegit);
                return true;

            case R.id.hakkimizda:
                showAlert("Hakkımızda Açılıyor");
                goToClass(Mic.class);
                return true;

            case R.id.cikis:
                showAlert("Çıkış Yapılıyor");
                finish();
                //System.exit(0);// hayvan gibi kapatıyor ashhafs
                return true;

            default:
                return super.onOptionsItemSelected(menu);
        }
    }

    //GENERICCC
    private <T> void goToClass(Class<T> mClass) { // T ile classı belirtiyoruz
        startActivity(new Intent(getApplicationContext(), mClass));
    }

    public void showAlert(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}

//Toast toast = Toast.makeText (getApplicationContext (), "hello", Toast.LENGTH_LONG);
//                    toast.setGravity (Gravity.CENTER_VERTICAL | Gravity.TOP, 0, 60);
//                    toast.show (); ------Toastın kendi içinde özellikleri var