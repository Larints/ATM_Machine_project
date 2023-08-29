package Model;

import java.io.Serializable;

/**
 * @apiNote Личный счет пользователя содержит поля: активен/деактивен,
 *          количество средств на счете
 */
public class Account implements Serializable{
	/**
	 * @apiNote Счет активен?
	 */
	boolean isActive = false;
	/**
	 * @apiNote Количество средств на счете
	 */
	double money;

	/**
	 * @apiNote Конструктор счета (изначально на счете 0)
	 */
	public Account() {
		isActive = true;
		money = 0;
	}

	/**
	 * 
	 * @return double - количество средств на счете
	 */
	public double getMoney() {
		return isActive ? -1 : money;
	}

	/**
	 * @apiNote double - количество вносимых средств
	 * 
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
}
