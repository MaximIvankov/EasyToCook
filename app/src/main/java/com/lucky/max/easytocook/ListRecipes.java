package com.lucky.max.easytocook;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListRecipes extends ListActivity {

    private ArrayAdapter<String> mAdapter; //адаптер для списка блюд

    final String[] listRecipe = new String[] {
            "Самса",
            "Шаурма",
            "Пирог с мясом",
            "Дошик",
            "Баланезе",
            "Блины",
            "Криветки",
            "Салат овощной",
            "Яичница",
            "Яичнеца+",
            "Овощи на гриле",
            "Жаркое",
            "Харчо",
            "Шурпа",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this, //адаптер для чтения из массива
                android.R.layout.simple_list_item_1, listRecipe);

        setListAdapter(mAdapter); //запуск адаптера

    }
}
