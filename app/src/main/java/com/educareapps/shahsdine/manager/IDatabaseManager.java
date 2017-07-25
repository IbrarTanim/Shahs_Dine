package com.educareapps.shahsdine.manager;

import com.educareapps.shahsdine.dao.User;

import java.util.ArrayList;



/**
 * Interface that provides methods for managing the database inside the Application.
 *
 * @author Octa
 */
public interface IDatabaseManager {

    /**
     * Closing available connections
     */
    void closeDbConnections();

    /**
     * Delete all tables and content from our database
     */
    void dropDatabase();

    /**
     * Insert a user into the DB
     *
     * @param user to be inserted
     */
    User insertUser(User user);

    /**
     * List all the users from the DB
     *
     * @return list of users
     */
    ArrayList<User> listUsers();

    /**
     * Update a user from the DB
     *
     * @param user to be updated
     */
    void updateUser(User user);

    /**
     * Delete all users with a certain email from the DB
     *
     * @param email of users to be deleted
     */
    void deleteUserByEmail(String email);

    /**
     * Delete a user with a certain id from the DB
     *
     * @param userId of users to be deleted
     */
    boolean deleteUserById(Long userId);

    /**
     * @param userId - of the user we want to fetch
     * @return Return a user by its id
     */
    User getUserById(Long userId);

    /**
     * Delete all the users from the DB
     */
    void deleteUsers();









}
