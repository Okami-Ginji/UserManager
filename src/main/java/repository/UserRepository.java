/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataacess.UserDAO;
/**
 *
 * @author Administrator
 */
public class UserRepository implements IUserRepository{

    @Override
    public void createNewAccount() {
        UserDAO.Instance().createNewAccount();
    }

    @Override
    public void loginSystem() {
       UserDAO.Instance().loginSystem();
    }
    
}
