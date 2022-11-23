package edu.cs.birzeit.burgerapp2;

import androidx.appcompat.app.AppCompatActivity;
import edu.cs.birzeit.burgerapp2.model.FoodItem;
import edu.cs.birzeit.burgerapp2.model.IItemsData;
import edu.cs.birzeit.burgerapp2.model.ItemsData;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private Spinner spn;
    private ListView lst;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        spn = findViewById(R.id.spnCats);
        lst = findViewById(R.id.lstItems);
        btn = findViewById(R.id.btnShow);

        IItemsData data = new ItemsData();
        List<String> cats = data.getCategories();
        ArrayAdapter<String> adapterCats = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cats);
        spn.setAdapter(adapterCats);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = spn.getSelectedItem().toString();
                List<FoodItem> result = data.getItemsByCat(str);
                ArrayAdapter<FoodItem> adapterItems = new ArrayAdapter<FoodItem>(MenuActivity.this,
                        android.R.layout.simple_list_item_1, result);
                lst.setAdapter(adapterItems);
            }
        });

    }
}