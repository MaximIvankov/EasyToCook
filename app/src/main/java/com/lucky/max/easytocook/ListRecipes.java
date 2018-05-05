package com.lucky.max.easytocook;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class  ListRecipes extends ListActivity implements AdapterView.OnItemLongClickListener {



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

    private ArrayAdapter<String> mAdapter; //адаптер для списка блюд
    private ArrayList<String>arrayListRecipe  = new ArrayList<>(Arrays.asList(listRecipe));
    //конвертация из обычного массива в коллекци





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this, //адаптер для чтения из массива
                android.R.layout.simple_list_item_1, arrayListRecipe);

        setListAdapter(mAdapter); //запуск адаптера
        getListView().setOnItemLongClickListener(this);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) { //работа с нажатиями
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(),
                "Вы выбрали " + (position + 0) + " элемент", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) { //обработчик долгих нажатий
        String selectedItem = parent.getItemAtPosition(position).toString();

        mAdapter.remove(selectedItem); // удаляем из эррей листа
        mAdapter.notifyDataSetChanged(); // сохранить изменения

        Toast.makeText(getApplicationContext(),
                selectedItem + " удалён.",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}
