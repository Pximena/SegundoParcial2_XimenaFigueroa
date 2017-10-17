package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Models.TeamModelFigueroaXimena;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 17/10/2017.
 */

public class TeamJsonFigueroaXimena {

    public static List<TeamModelFigueroaXimena> getData(String content) throws JSONException {
        JSONObject jsonObject = new JSONObject(content);
        JSONArray jsonArray = jsonObject.getJSONArray("teams");
        List<TeamModelFigueroaXimena> teamModelFigueroaXimenaList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            TeamModelFigueroaXimena teamModelFigueroaXimena = new TeamModelFigueroaXimena();

            teamModelFigueroaXimena.setCode(item.getString("name"));
            teamModelFigueroaXimena.setCode(item.getString("code"));

            teamModelFigueroaXimenaList.add(teamModelFigueroaXimena);
        }
        return teamModelFigueroaXimenaList;
    }
}
