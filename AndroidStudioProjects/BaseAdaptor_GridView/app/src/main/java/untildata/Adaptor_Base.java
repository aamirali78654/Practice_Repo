package untildata;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Adaptor_Base extends BaseAdapter
{
     Context context;
     int []data;

    Adaptor_Base(Context context ,int []data)
    {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {

        return 0; //img_view.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
