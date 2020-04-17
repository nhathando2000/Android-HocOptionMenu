package donguyennhathan.com.hocoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnHuongDan:
                Intent intent = new Intent(MainActivity.this, HuongDanActivity.class);
                startActivity(intent);
                break;
            case R.id.mnGioiThieu:
                Toast.makeText(MainActivity.this,"Chào mừng bạn đến với menu Giới Thiệu", Toast.LENGTH_LONG);
                break;
            default:
                Toast.makeText(MainActivity.this,"Error", Toast.LENGTH_LONG);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
