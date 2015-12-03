package com.skynox.whereyou.app;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.skynox.whereyou.app.model.PeopleModel;

import java.util.ArrayList;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class Config {

    public static Boolean STATUS_SYNC_GPS = false;

    public static int ACTIVE_ACTIVITY = 0;

    public static ArrayList<PeopleModel> PEOPLE_LIST = new ArrayList<PeopleModel>();

    public static GoogleSignInAccount ACCOUNT;

}