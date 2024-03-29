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

import org.xtext.example.mydsl.myst.CSV;
import org.xtext.example.mydsl.myst.Calcul;
import org.xtext.example.mydsl.myst.Metric;
import org.xtext.example.mydsl.myst.MystPackage;
import org.xtext.example.mydsl.myst.Parse;
import org.xtext.example.mydsl.myst.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.ProgramImpl#getCsv <em>Csv</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.ProgramImpl#getParse <em>Parse</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.ProgramImpl#getCalcul <em>Calcul</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.ProgramImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getCsv() <em>Csv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsv()
   * @generated
   * @ordered
   */
  protected CSV csv;

  /**
   * The cached value of the '{@link #getParse() <em>Parse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParse()
   * @generated
   * @ordered
   */
  protected Parse parse;

  /**
   * The cached value of the '{@link #getCalcul() <em>Calcul</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalcul()
   * @generated
   * @ordered
   */
  protected Calcul calcul;

  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final Metric METRIC_EDEFAULT = Metric.ACCURACY;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected Metric metric = METRIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return MystPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CSV getCsv()
  {
    return csv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsv(CSV newCsv, NotificationChain msgs)
  {
    CSV oldCsv = csv;
    csv = newCsv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__CSV, oldCsv, newCsv);
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
  public void setCsv(CSV newCsv)
  {
    if (newCsv != csv)
    {
      NotificationChain msgs = null;
      if (csv != null)
        msgs = ((InternalEObject)csv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__CSV, null, msgs);
      if (newCsv != null)
        msgs = ((InternalEObject)newCsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__CSV, null, msgs);
      msgs = basicSetCsv(newCsv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__CSV, newCsv, newCsv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parse getParse()
  {
    return parse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParse(Parse newParse, NotificationChain msgs)
  {
    Parse oldParse = parse;
    parse = newParse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__PARSE, oldParse, newParse);
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
  public void setParse(Parse newParse)
  {
    if (newParse != parse)
    {
      NotificationChain msgs = null;
      if (parse != null)
        msgs = ((InternalEObject)parse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__PARSE, null, msgs);
      if (newParse != null)
        msgs = ((InternalEObject)newParse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__PARSE, null, msgs);
      msgs = basicSetParse(newParse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__PARSE, newParse, newParse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Calcul getCalcul()
  {
    return calcul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalcul(Calcul newCalcul, NotificationChain msgs)
  {
    Calcul oldCalcul = calcul;
    calcul = newCalcul;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__CALCUL, oldCalcul, newCalcul);
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
  public void setCalcul(Calcul newCalcul)
  {
    if (newCalcul != calcul)
    {
      NotificationChain msgs = null;
      if (calcul != null)
        msgs = ((InternalEObject)calcul).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__CALCUL, null, msgs);
      if (newCalcul != null)
        msgs = ((InternalEObject)newCalcul).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MystPackage.PROGRAM__CALCUL, null, msgs);
      msgs = basicSetCalcul(newCalcul, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__CALCUL, newCalcul, newCalcul));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Metric getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetric(Metric newMetric)
  {
    Metric oldMetric = metric;
    metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.PROGRAM__METRIC, oldMetric, metric));
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
      case MystPackage.PROGRAM__CSV:
        return basicSetCsv(null, msgs);
      case MystPackage.PROGRAM__PARSE:
        return basicSetParse(null, msgs);
      case MystPackage.PROGRAM__CALCUL:
        return basicSetCalcul(null, msgs);
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
      case MystPackage.PROGRAM__CSV:
        return getCsv();
      case MystPackage.PROGRAM__PARSE:
        return getParse();
      case MystPackage.PROGRAM__CALCUL:
        return getCalcul();
      case MystPackage.PROGRAM__METRIC:
        return getMetric();
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
      case MystPackage.PROGRAM__CSV:
        setCsv((CSV)newValue);
        return;
      case MystPackage.PROGRAM__PARSE:
        setParse((Parse)newValue);
        return;
      case MystPackage.PROGRAM__CALCUL:
        setCalcul((Calcul)newValue);
        return;
      case MystPackage.PROGRAM__METRIC:
        setMetric((Metric)newValue);
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
      case MystPackage.PROGRAM__CSV:
        setCsv((CSV)null);
        return;
      case MystPackage.PROGRAM__PARSE:
        setParse((Parse)null);
        return;
      case MystPackage.PROGRAM__CALCUL:
        setCalcul((Calcul)null);
        return;
      case MystPackage.PROGRAM__METRIC:
        setMetric(METRIC_EDEFAULT);
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
      case MystPackage.PROGRAM__CSV:
        return csv != null;
      case MystPackage.PROGRAM__PARSE:
        return parse != null;
      case MystPackage.PROGRAM__CALCUL:
        return calcul != null;
      case MystPackage.PROGRAM__METRIC:
        return metric != METRIC_EDEFAULT;
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
    result.append(" (metric: ");
    result.append(metric);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
