package com.example.loc.demo;

import android.annotation.SuppressLint;
import android.os.Parcel;

import com.example.loc.library.AsymmetricItem;

import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by loc on 31/01/2016.
 */
//@SuppressLint("ParcelCreator")
public class item implements AsymmetricItem {
    private int columnSpan;
    private int rowSpan;
    private int position;

    //  demo .. colum1 riw 1, vt thứ 0
    public item() {
        this(1, 1, 0);
    }

    public item(int columnSpan, int rowSpan, int position) {
        this.columnSpan = columnSpan;
        this.rowSpan = rowSpan;
        this.position = position;
    }

    public item(Parcel in) {
        readFromParcel(in);
    }

    @Override
    public int getColumnSpan() {
        return columnSpan;
    }

    @Override
    public int getRowSpan() {
        return rowSpan;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        /// format string
        return String.format("%s: %sx%s", position, rowSpan, columnSpan);
    }

    @Override
    public int describeContents() {
        return 0;

    }

    private void readFromParcel(Parcel in) {
        columnSpan = in.readInt();
        rowSpan = in.readInt();
        position = in.readInt();
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(columnSpan);
        dest.writeInt(rowSpan);
        dest.writeInt(position);
    }

    /* Parcelable interface implementation */
    public static final Parcelable.Creator<item> CREATOR = new Parcelable.Creator<item>() {

        @Override
        public item createFromParcel(@NonNull Parcel in) {
            return new item(in);
        }

        @Override
        @NonNull
        public item[] newArray(int size) {
            return new item[size];
        }
    };
}
