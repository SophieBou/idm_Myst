/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myst.CSV;
import org.xtext.example.mydsl.myst.MystPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.impl.CSVImpl#getCvsfile <em>Cvsfile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVImpl extends MinimalEObjectImpl.Container implements CSV
{
  /**
   * The default value of the '{@link #getCvsfile() <em>Cvsfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCvsfile()
   * @generated
   * @ordered
   */
  protected static final String CVSFILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCvsfile() <em>Cvsfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCvsfile()
   * @generated
   * @ordered
   */
  protected String cvsfile = CVSFILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVImpl()
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
    return MystPackage.Literals.CSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCvsfile()
  {
    return cvsfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCvsfile(String newCvsfile)
  {
    String oldCvsfile = cvsfile;
    cvsfile = newCvsfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MystPackage.CSV__CVSFILE, oldCvsfile, cvsfile));
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
      case MystPackage.CSV__CVSFILE:
        return getCvsfile();
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
      case MystPackage.CSV__CVSFILE:
        setCvsfile((String)newValue);
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
      case MystPackage.CSV__CVSFILE:
        setCvsfile(CVSFILE_EDEFAULT);
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
      case MystPackage.CSV__CVSFILE:
        return CVSFILE_EDEFAULT == null ? cvsfile != null : !CVSFILE_EDEFAULT.equals(cvsfile);
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
    result.append(" (cvsfile: ");
    result.append(cvsfile);
    result.append(')');
    return result.toString();
  }

} //CSVImpl
