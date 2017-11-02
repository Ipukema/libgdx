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

public class FilterableVehicleRaycaster extends btDefaultVehicleRaycaster {
	private long swigCPtr;
	
	protected FilterableVehicleRaycaster(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.FilterableVehicleRaycaster_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new FilterableVehicleRaycaster, normally you should not need this constructor it's intended for low-level usage. */
	public FilterableVehicleRaycaster(long cPtr, boolean cMemoryOwn) {
		this("FilterableVehicleRaycaster", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.FilterableVehicleRaycaster_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(FilterableVehicleRaycaster obj) {
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
				DynamicsJNI.delete_FilterableVehicleRaycaster(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public FilterableVehicleRaycaster(btDynamicsWorld world) {
    this(DynamicsJNI.new_FilterableVehicleRaycaster(btDynamicsWorld.getCPtr(world), world), true);
  }

  public void setCollisionFilterMask(short collisionFilterMask) {
    DynamicsJNI.FilterableVehicleRaycaster_setCollisionFilterMask(swigCPtr, this, collisionFilterMask);
  }

  public void setCollisionFilterGroup(short collisionFilterGroup) {
    DynamicsJNI.FilterableVehicleRaycaster_setCollisionFilterGroup(swigCPtr, this, collisionFilterGroup);
  }

}
