/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myst.CrossValidation;
import org.xtext.example.mydsl.myst.MystPackage;
import org.xtext.example.mydsl.myst.Strategy;
import org.xtext.example.mydsl.myst.TrainingTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.StrategyImpl#getTrainingTest <em>Training Test</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.StrategyImpl#getCrossValidation <em>Cross Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy
{
  /**
   * The cached value of the '{@link #getTrainingTest() <em>Training Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrainingTest()
   * @generated
   * @ordered
   */
  protected TrainingTest trainingTest;

  /**
   * The cached value of the '{@link #getCrossValidation() <em>Cross Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrossValidation()
   * @generated
   * @ordered
   */
  protected CrossValidation crossValidation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyImpl()
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
    return MystPackage.Literals.STRATEGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TrainingTest getTrainingTest()
  {
    return trainingTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrainingTest(TrainingTest newTrainingTest, NotificationChain msgs)
  {
    TrainingTest oldTrainingTest = trainingTest;
    trainingTest = newTrainingTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MystPackage.STRATEGY__TRAINING_TEST, oldTrainingTest, newTrainingTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTrainingTest(TrainingTest newTrainingTest)
  {
    if (newTrainingTest != trainingTest)
    {
      NotificationChain msgs = null;
      if (trainingTest != null)
        msgs = ((InternalEObject)trainingTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MystPackage.STRATEGY__TRAINING_TEST, null, msgs);
      if (newTrainingTest != null)
        msgs = ((InternalEObject)newTrainingTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MystPackage.STRATEGY__TRAINING_TEST, null, msgs);
      msgs = basicSetTrainingTest(newTrainingTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.STRATEGY__TRAINING_TEST, newTrainingTest, newTrainingTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CrossValidation getCrossValidation()
  {
    return crossValidation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCrossValidation(CrossValidation newCrossValidation, NotificationChain msgs)
  {
    CrossValidation oldCrossValidation = crossValidation;
    crossValidation = newCrossValidation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MystPackage.STRATEGY__CROSS_VALIDATION, oldCrossValidation, newCrossValidation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCrossValidation(CrossValidation newCrossValidation)
  {
    if (newCrossValidation != crossValidation)
    {
      NotificationChain msgs = null;
      if (crossValidation != null)
        msgs = ((InternalEObject)crossValidation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MystPackage.STRATEGY__CROSS_VALIDATION, null, msgs);
      if (newCrossValidation != null)
        msgs = ((InternalEObject)newCrossValidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MystPackage.STRATEGY__CROSS_VALIDATION, null, msgs);
      msgs = basicSetCrossValidation(newCrossValidation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.STRATEGY__CROSS_VALIDATION, newCrossValidation, newCrossValidation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MystPackage.STRATEGY__TRAINING_TEST:
        return basicSetTrainingTest(null, msgs);
      case MystPackage.STRATEGY__CROSS_VALIDATION:
        return basicSetCrossValidation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MystPackage.STRATEGY__TRAINING_TEST:
        return getTrainingTest();
      case MystPackage.STRATEGY__CROSS_VALIDATION:
        return getCrossValidation();
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
      case MystPackage.STRATEGY__TRAINING_TEST:
        setTrainingTest((TrainingTest)newValue);
        return;
      case MystPackage.STRATEGY__CROSS_VALIDATION:
        setCrossValidation((CrossValidation)newValue);
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
      case MystPackage.STRATEGY__TRAINING_TEST:
        setTrainingTest((TrainingTest)null);
        return;
      case MystPackage.STRATEGY__CROSS_VALIDATION:
        setCrossValidation((CrossValidation)null);
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
      case MystPackage.STRATEGY__TRAINING_TEST:
        return trainingTest != null;
      case MystPackage.STRATEGY__CROSS_VALIDATION:
        return crossValidation != null;
    }
    return super.eIsSet(featureID);
  }

} //StrategyImpl