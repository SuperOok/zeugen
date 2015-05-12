/**
 */
package zeugen.zeugnis;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Note</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link zeugen.zeugnis.Note#getWert <em>Wert</em>}</li>
 * </ul>
 * </p>
 *
 * @see zeugen.zeugnis.ZeugnisPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends Beurteilung {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(int)
	 * @see zeugen.zeugnis.ZeugnisPackage#getNote_Wert()
	 * @model required="true"
	 * @generated
	 */
	int getWert();

	/**
	 * Sets the value of the '{@link zeugen.zeugnis.Note#getWert <em>Wert</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(int value);

} // Note
