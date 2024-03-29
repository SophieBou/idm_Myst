/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myst.MystPackage;
import org.xtext.example.mydsl.myst.TrainingTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.TrainingTestImpl#getTestRate <em>Test Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingTestImpl extends MinimalEObjectImpl.Container implements TrainingTest
{
  /**
   * The default value of the '{@link #getTestRate() <em>Test Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestRate()
   * @generated
   * @ordered
   */
  protected static final double TEST_RATE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getTestRate() <em>Test Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestRate()
   * @generated
   * @ordered
   */
  protected double testRate = TEST_RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrainingTestImpl()
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
    return MystPackage.Literals.TRAINING_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getTestRate()
  {
    return testRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTestRate(double newTestRate)
  {
    double oldTestRate = testRate;
    testRate = newTestRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.TRAINING_TEST__TEST_RATE, oldTestRate, testRate));
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
      case MystPackage.TRAINING_TEST__TEST_RATE:
        return getTestRate();
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
      case MystPackage.TRAINING_TEST__TEST_RATE:
        setTestRate((Double)newValue);
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
      case MystPackage.TRAINING_TEST__TEST_RATE:
        setTestRate(TEST_RATE_EDEFAULT);
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
      case MystPackage.TRAINING_TEST__TEST_RATE:
        return testRate != TEST_RATE_EDEFAULT;
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
    result.append(" (testRate: ");
    result.append(testRate);
    result.append(')');
    return result.toString();
  }

} //TrainingTestImpl
