package service.impl;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.User;
import service.UserServise;

import java.sql.SQLException;

/**
 * @author Andrey Volinskiy on 23.02.2018.
 */
public class UserServiceImpl implements UserServise {

    private static final String URL = "jdbc:sqlite:src/main/resources/bot.sqlite";
    private Dao<User, Integer> dao;
    {
        try {
            ConnectionSource source = new JdbcConnectionSource(URL);
            dao = DaoManager.createDao(source, User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
