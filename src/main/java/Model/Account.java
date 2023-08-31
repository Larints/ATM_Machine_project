package Model;

import java.io.Serializable;

/**
 * @apiNote Личный счет пользователя содержит поля: активен/деактивен,
 * количество средств на счете
 */
public class Account implements Serializable {

    /**
     * Номер счета
     */
    private long ID;
    /**
     * @apiNote Счет активен?
     */
    private boolean isActive = false;
    /**
     * @apiNote Количество средств на счете
     */
    private double money;
    /**
     * User - владелец счета
     */
    private User user;

    /**
     * @apiNote Конструктор счета (изначально на счете 0)
     */
    public Account(User user, long ID) {
        isActive = true;
        money = 0;
        this.ID = ID;
        this.user = user;
        user.addAccount(this);
    }

    /**
     * @return double - количество средств на счете
     */
    public double getMoney() {
        return isActive ? -1 : money;
    }

    /**
     * @apiNote double - количество вносимых средств
     */
    public void setMoney(double money) {
        this.money = isActive ? money : this.money;
    }

    /**
     * @apiNote Метод для деактивации счета
     */
    public void diactivate() {
        isActive = false;
    }

    public long getID() {
        return ID;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ID);
        sb.append(" : ");
        sb.append(money);
        sb.append(" - ");
        sb.append(isActive);
        return sb.toString();
    }
}