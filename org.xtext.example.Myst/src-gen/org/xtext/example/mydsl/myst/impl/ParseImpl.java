/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myst.MystPackage;
import org.xtext.example.mydsl.myst.Parse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.ParseImpl#getVariableCible <em>Variable Cible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParseImpl extends MinimalEObjectImpl.Container implements Parse
{
  /**
   * The default value of the '{@link #getVariableCible() <em>Variable Cible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableCible()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_CIBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableCible() <em>Variable Cible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableCible()
   * @generated
   * @ordered
   */
  protected String variableCible = VARIABLE_CIBLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MystPackage.Literals.PARSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariableCible()
  {
    return variableCible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariableCible(String newVariableCible)
  {
    String oldVariableCible = variableCible;
    variableCible = newVariableCible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.PARSE__VARIABLE_CIBLE, oldVariableCible, variableCible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MystPackage.PARSE__VARIABLE_CIBLE:
        return getVariableCible();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MystPackage.PARSE__VARIABLE_CIBLE:
        setVariableCible((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MystPackage.PARSE__VARIABLE_CIBLE:
        setVariableCible(VARIABLE_CIBLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MystPackage.PARSE__VARIABLE_CIBLE:
        return VARIABLE_CIBLE_EDEFAULT == null ? variableCible != null : !VARIABLE_CIBLE_EDEFAULT.equals(variableCible);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (variableCible: ");
    result.append(variableCible);
    result.append(')');
    return result.toString();
  }

} //ParseImpl
