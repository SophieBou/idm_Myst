/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myst;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myst.MystPackage#getAlgorithm()
 * @model
 * @generated
 */
public enum Algorithm implements Enumerator
{
  /**
   * The '<em><b>Linear Discriminant Analysis</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINEAR_DISCRIMINANT_ANALYSIS_VALUE
   * @generated
   * @ordered
   */
  LINEAR_DISCRIMINANT_ANALYSIS(0, "LinearDiscriminantAnalysis", "linearDiscriminantAnalysis"),

  /**
   * The '<em><b>Support Vector Machines</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPORT_VECTOR_MACHINES_VALUE
   * @generated
   * @ordered
   */
  SUPPORT_VECTOR_MACHINES(1, "SupportVectorMachines", "supportVectorMachines"),

  /**
   * The '<em><b>Quadratic Discriminant Analysis</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUADRATIC_DISCRIMINANT_ANALYSIS_VALUE
   * @generated
   * @ordered
   */
  QUADRATIC_DISCRIMINANT_ANALYSIS(2, "QuadraticDiscriminantAnalysis", "quadraticDiscriminantAnalysis"),

  /**
   * The '<em><b>Kernel Estimation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KERNEL_ESTIMATION_VALUE
   * @generated
   * @ordered
   */
  KERNEL_ESTIMATION(3, "KernelEstimation", "kernelEstimation"),

  /**
   * The '<em><b>Boosting</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOSTING_VALUE
   * @generated
   * @ordered
   */
  BOOSTING(4, "Boosting", "boosting"),

  /**
   * The '<em><b>Decision Tree</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECISION_TREE_VALUE
   * @generated
   * @ordered
   */
  DECISION_TREE(5, "DecisionTree", "decisionTree"),

  /**
   * The '<em><b>Neutral Network</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEUTRAL_NETWORK_VALUE
   * @generated
   * @ordered
   */
  NEUTRAL_NETWORK(6, "NeutralNetwork", "neutralNetwork"),

  /**
   * The '<em><b>Learning Vector Quantization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEARNING_VECTOR_QUANTIZATION_VALUE
   * @generated
   * @ordered
   */
  LEARNING_VECTOR_QUANTIZATION(7, "LearningVectorQuantization", "learningVectorQuantization");

  /**
   * The '<em><b>Linear Discriminant Analysis</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINEAR_DISCRIMINANT_ANALYSIS
   * @model name="LinearDiscriminantAnalysis" literal="linearDiscriminantAnalysis"
   * @generated
   * @ordered
   */
  public static final int LINEAR_DISCRIMINANT_ANALYSIS_VALUE = 0;

  /**
   * The '<em><b>Support Vector Machines</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPORT_VECTOR_MACHINES
   * @model name="SupportVectorMachines" literal="supportVectorMachines"
   * @generated
   * @ordered
   */
  public static final int SUPPORT_VECTOR_MACHINES_VALUE = 1;

  /**
   * The '<em><b>Quadratic Discriminant Analysis</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUADRATIC_DISCRIMINANT_ANALYSIS
   * @model name="QuadraticDiscriminantAnalysis" literal="quadraticDiscriminantAnalysis"
   * @generated
   * @ordered
   */
  public static final int QUADRATIC_DISCRIMINANT_ANALYSIS_VALUE = 2;

  /**
   * The '<em><b>Kernel Estimation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KERNEL_ESTIMATION
   * @model name="KernelEstimation" literal="kernelEstimation"
   * @generated
   * @ordered
   */
  public static final int KERNEL_ESTIMATION_VALUE = 3;

  /**
   * The '<em><b>Boosting</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOSTING
   * @model name="Boosting" literal="boosting"
   * @generated
   * @ordered
   */
  public static final int BOOSTING_VALUE = 4;

  /**
   * The '<em><b>Decision Tree</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECISION_TREE
   * @model name="DecisionTree" literal="decisionTree"
   * @generated
   * @ordered
   */
  public static final int DECISION_TREE_VALUE = 5;

  /**
   * The '<em><b>Neutral Network</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEUTRAL_NETWORK
   * @model name="NeutralNetwork" literal="neutralNetwork"
   * @generated
   * @ordered
   */
  public static final int NEUTRAL_NETWORK_VALUE = 6;

  /**
   * The '<em><b>Learning Vector Quantization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEARNING_VECTOR_QUANTIZATION
   * @model name="LearningVectorQuantization" literal="learningVectorQuantization"
   * @generated
   * @ordered
   */
  public static final int LEARNING_VECTOR_QUANTIZATION_VALUE = 7;

  /**
   * An array of all the '<em><b>Algorithm</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Algorithm[] VALUES_ARRAY =
    new Algorithm[]
    {
      LINEAR_DISCRIMINANT_ANALYSIS,
      SUPPORT_VECTOR_MACHINES,
      QUADRATIC_DISCRIMINANT_ANALYSIS,
      KERNEL_ESTIMATION,
      BOOSTING,
      DECISION_TREE,
      NEUTRAL_NETWORK,
      LEARNING_VECTOR_QUANTIZATION,
    };

  /**
   * A public read-only list of all the '<em><b>Algorithm</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Algorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Algorithm</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithm get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Algorithm result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algorithm</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithm getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Algorithm result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algorithm</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Algorithm get(int value)
  {
    switch (value)
    {
      case LINEAR_DISCRIMINANT_ANALYSIS_VALUE: return LINEAR_DISCRIMINANT_ANALYSIS;
      case SUPPORT_VECTOR_MACHINES_VALUE: return SUPPORT_VECTOR_MACHINES;
      case QUADRATIC_DISCRIMINANT_ANALYSIS_VALUE: return QUADRATIC_DISCRIMINANT_ANALYSIS;
      case KERNEL_ESTIMATION_VALUE: return KERNEL_ESTIMATION;
      case BOOSTING_VALUE: return BOOSTING;
      case DECISION_TREE_VALUE: return DECISION_TREE;
      case NEUTRAL_NETWORK_VALUE: return NEUTRAL_NETWORK;
      case LEARNING_VECTOR_QUANTIZATION_VALUE: return LEARNING_VECTOR_QUANTIZATION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Algorithm(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Algorithm
