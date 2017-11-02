/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPoint2PointConstraint extends btTypedConstraint {
	private long swigCPtr;
	
	protected btPoint2PointConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btPoint2PointConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPoint2PointConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btPoint2PointConstraint(long cPtr, boolean cMemoryOwn) {
		this("btPoint2PointConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btPoint2PointConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btPoint2PointConstraint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btPoint2PointConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setUseSolveConstraintObsolete(boolean value) {
    DynamicsJNI.btPoint2PointConstraint_useSolveConstraintObsolete_set(swigCPtr, this, value);
  }

  public boolean getUseSolveConstraintObsolete() {
    return DynamicsJNI.btPoint2PointConstraint_useSolveConstraintObsolete_get(swigCPtr, this);
  }

  public void setSetting(btConstraintSetting value) {
    DynamicsJNI.btPoint2PointConstraint_setting_set(swigCPtr, this, btConstraintSetting.getCPtr(value), value);
  }

  public btConstraintSetting getSetting() {
    long cPtr = DynamicsJNI.btPoint2PointConstraint_setting_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConstraintSetting(cPtr, false);
  }

  public btPoint2PointConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB) {
    this(DynamicsJNI.new_btPoint2PointConstraint__SWIG_0(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, pivotInA, pivotInB), true);
  }

  public btPoint2PointConstraint(btRigidBody rbA, Vector3 pivotInA) {
    this(DynamicsJNI.new_btPoint2PointConstraint__SWIG_1(btRigidBody.getCPtr(rbA), rbA, pivotInA), true);
  }

  public void getInfo1NonVirtual(btTypedConstraint.btConstraintInfo1 info) {
    DynamicsJNI.btPoint2PointConstraint_getInfo1NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo1.getCPtr(info), info);
  }

  public void getInfo2NonVirtual(btTypedConstraint.btConstraintInfo2 info, Matrix4 body0_trans, Matrix4 body1_trans) {
    DynamicsJNI.btPoint2PointConstraint_getInfo2NonVirtual(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info, body0_trans, body1_trans);
  }

  public void updateRHS(float timeStep) {
    DynamicsJNI.btPoint2PointConstraint_updateRHS(swigCPtr, this, timeStep);
  }

  public void setPivotA(Vector3 pivotA) {
    DynamicsJNI.btPoint2PointConstraint_setPivotA(swigCPtr, this, pivotA);
  }

  public void setPivotB(Vector3 pivotB) {
    DynamicsJNI.btPoint2PointConstraint_setPivotB(swigCPtr, this, pivotB);
  }

  public Vector3 getPivotInA() {
	return DynamicsJNI.btPoint2PointConstraint_getPivotInA(swigCPtr, this);
}

  public Vector3 getPivotInB() {
	return DynamicsJNI.btPoint2PointConstraint_getPivotInB(swigCPtr, this);
}

  public void setParam(int num, float value, int axis) {
    DynamicsJNI.btPoint2PointConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    DynamicsJNI.btPoint2PointConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public float getParam(int num, int axis) {
    return DynamicsJNI.btPoint2PointConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return DynamicsJNI.btPoint2PointConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public int getFlags() {
    return DynamicsJNI.btPoint2PointConstraint_getFlags(swigCPtr, this);
  }

}
