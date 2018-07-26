package br.com.leanwork.testedevandroidlean;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoSQLiteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "BancoComSqlite.db";

    private static final String SQL_CREATE_PERSON_TABLE = "";

    private static final String SQL_CREATE_ADDRESSES_TABLE = "";

    private static final String SQL_DELETE_PERSON_TABLE =
            "DROP TABLE IF EXISTS " + Pessoa.PessoaDBEntry.TABLE_NAME;

    private static final String SQL_DELETE_ADRESSES_TABLE =
            "DROP TABLE IF EXISTS " + Endereco.EnderecoDBEntry.TABLE_NAME;

    BancoSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PERSON_TABLE);
        db.execSQL(SQL_CREATE_ADDRESSES_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_PERSON_TABLE);
        db.execSQL(SQL_DELETE_ADRESSES_TABLE);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

}
