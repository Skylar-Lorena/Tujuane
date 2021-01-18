package com.skylar.tembeakenya;

import android.content.Context;

public class TembeaKenyaArrayAdapter {

    private Context mContext;
    private String[] mLocations = new String[] {"Kabete","Ngong Rd","Kiambu Rd","Langata","Karen","Mombasa Rd","Upper Hill"};
    private String[] mPlacesToGo = new String[] {"Kereita(zip lining,trekking,cycling)","Paint Ball Kenya(paint balling)","Karura Forest(cycling,treking)","GP Karting(Go Karting)","Malo Stables(horse riding)","Panari Hotel(ice skating)","Kenya Regiment Club(shooting range)"};

    public TravelGuideArrayAdapter(Context context, int resource, String[] locations, String[] placesToGo) {
        super(context,resource);
        this.mLocations = locations;
        this.mPlacesToGo = placesToGo;
    }
    @Override
    public int getCount() {
        return mLocations.length;
    }

    @Override
    public Object getItem(int position) {

        return super.getItem(position);
    }




}

