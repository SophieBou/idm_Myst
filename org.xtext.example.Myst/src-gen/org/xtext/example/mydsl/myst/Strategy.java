/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myst.Strategy#getTrainingTest <em>Training Test</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myst.Strategy#getCrossValidation <em>Cross Validation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myst.MystPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends EObject
{
  /**
   * Returns the value of the '<em><b>Training Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Training Test</em>' containment reference.
   * @see #setTrainingTest(TrainingTest)
   * @see org.xtext.example.mydsl.myst.MystPackage#getStrategy_TrainingTest()
   * @model containment="true"
   * @generated
   */
  TrainingTest getTrainingTest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myst.Strategy#getTrainingTest <em>Training Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Training Test</em>' containment reference.
   * @see #getTrainingTest()
   * @generated
   */
  void setTrainingTest(TrainingTest value);

  /**
   * Returns the value of the '<em><b>Cross Validation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cross Validation</em>' containment reference.
   * @see #setCrossValidation(CrossValidation)
   * @see org.xtext.example.mydsl.myst.MystPackage#getStrategy_CrossValidation()
   * @model containment="true"
   * @generated
   */
  CrossValidation getCrossValidation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myst.Strategy#getCrossValidation <em>Cross Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cross Validation</em>' containment reference.
   * @see #getCrossValidation()
   * @generated
   */
  void setCrossValidation(CrossValidation value);

} // Strategy
