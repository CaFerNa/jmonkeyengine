/*
 * Copyright (c) 2003, jMonkeyEngine - Mojo Monkey Coding
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this 
 * list of conditions and the following disclaimer. 
 * 
 * Redistributions in binary form must reproduce the above copyright notice, 
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution. 
 * 
 * Neither the name of the Mojo Monkey Coding, jME, jMonkey Engine, nor the 
 * names of its contributors may be used to endorse or promote products derived 
 * from this software without specific prior written permission. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */
package com.jme.math;

import java.util.logging.Level;

import com.jme.system.JmeException;
import com.jme.util.LoggingSystem;

/**
 * <code>Matrix3f</code> defines a 3x3 matrix. Matrix data is maintained 
 * internally and is acessible via the get and set methods. Convenience 
 * methods are used for matrix operations as well as generating a matrix from
 * a given set of values.
 * @author Mark Powell
 * @version $Id: Matrix3f.java,v 1.10 2004-02-19 23:12:03 mojomonkey Exp $
 */
public class Matrix3f {
    private float[][] matrix;

    /**
     * Constructor instantiates a new <code>Matrix3f</code> object. The
     * initial values for the matrix is that of the identity matrix.
     *
     */
    public Matrix3f() {
        matrix = new float[3][3];
        loadIdentity();
    }
    
    /**
     * Copy constructor that creates a new <code>Matrix3f</code> object
     * that is the same as the provided matrix.
     * @param mat the matrix to copy.
     */
    public Matrix3f(Matrix3f mat) {
    	copy(mat);
    }
    
    /**
     * <code>copy</code> transfers the contents of a given matrix to this
     * matrix. If a null matrix is supplied, this matrix is set to the
     * identity matrix.
     * @param matrix the matrix to copy.
     */
    public void copy(Matrix3f matrix) {
        if(null == matrix) {
            loadIdentity();
        } else {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                 this.matrix[i][j] = matrix.matrix[i][j];
              }
            }
        }
    }

    /**
     * <code>get</code> retrieves a value from the matrix at the given 
     * position. If the position is invalid a <code>JmeException</code>
     * is thrown.
     * @param i the row index.
     * @param j the colum index.
     * @return the value at (i, j).
     */
    public float get(int i, int j) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Invalid matrix index.");
            throw new JmeException("Invalid indices into matrix.");
        }
        return matrix[i][j];
    }

    /**
     * <code>getColumn</code> returns one of three columns specified by the
     * parameter. This column is returned as a <code>Vector3f</code> object.
     * 
     * @param i the column to retrieve. Must be between 0 and 2.
     * @return the column specified by the index.
     */
    public Vector3f getColumn(int i) {
        if (i < 0 || i > 2) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Invalid column index.");
            throw new JmeException("Invalid column index. " + i);
        }
        return new Vector3f(matrix[0][i], matrix[1][i], matrix[2][i]);
    }
    
    /**
     * 
     * <code>setColumn</code> sets a particular column of this matrix to that
     * represented by the provided vector.
     * @param i the column to set.
     * @param column the data to set.
     */
    public void setColumn(int i, Vector3f column) {
        if(i < 0 || i > 2) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Invalid column index.");
            throw new JmeException("Invalid column index. " + i);
        }
        
        if(column == null) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Column is null. Ignoring.");
            return;
        }
        
        matrix[0][i] = column.x;
        matrix[1][i] = column.y;
        matrix[2][i] = column.z;
    }

    /**
     * <code>set</code> places a given value into the matrix at the given
     * position. If the position is invalid a <code>JmeException</code>
     * is thrown.
     * @param i the row index.
     * @param j the colum index.
     * @param value the value for (i, j).
     */
    public void set(int i, int j, float value) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Invalid matrix index.");
            throw new JmeException("Invalid indices into matrix.");
        }
        matrix[i][j] = value;
    }
    
    /**
     * 
     * <code>set</code> sets the values of the matrix to those supplied by
     * the 3x3 two dimenion array. 
     * @param matrix the new values of the matrix.
     */
    public void set(float[][] matrix) {
        if(matrix.length != 3 || matrix[0].length != 3) {
            return;
        }
        
        this.matrix = matrix;
    }
    
    /**
	 * <code>set</code> sets the values of this matrix from an array of
	 * values;
	 * @param matrix the matrix to set the value to.
	 */
	public void set(float[] matrix) {
		if (matrix.length != 9) {
			throw new JmeException("Array must be of size 9.");
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.matrix[i][j] = matrix[j*3 + i];
			}
		}
	}
    
    /**
     * 
     * <code>set</code> defines the values of the matrix based on a supplied
     * <code>Quaternion</code>. It should be noted that all previous values
     * will be overridden.
     * @param quat the quaternion to create a rotational matrix from.
     */
    public void set(Quaternion quaternion) {
		loadIdentity();
		matrix[0][0] = (float) (1.0 - 2.0 * quaternion.y * quaternion.y - 2.0 * quaternion.z * quaternion.z);
		matrix[1][0] = (float) (2.0 * quaternion.x * quaternion.y + 2.0 * quaternion.w * quaternion.z);
		matrix[2][0] = (float) (2.0 * quaternion.x * quaternion.z - 2.0 * quaternion.w * quaternion.y);

		matrix[0][1] = (float) (2.0 * quaternion.x * quaternion.y - 2.0 * quaternion.w * quaternion.z);
		matrix[1][1] = (float) (1.0 - 2.0 * quaternion.x * quaternion.x - 2.0 * quaternion.z * quaternion.z);
		matrix[2][1] = (float) (2.0 * quaternion.y * quaternion.z + 2.0 * quaternion.w * quaternion.x);

		matrix[0][2] = (float) (2.0 * quaternion.x * quaternion.z + 2.0 * quaternion.w * quaternion.y);
		matrix[1][2] = (float) (2.0 * quaternion.y * quaternion.z - 2.0 * quaternion.w * quaternion.x);
		matrix[2][2] = (float) (1.0 - 2.0 * quaternion.x * quaternion.x - 2.0 * quaternion.y * quaternion.y);

    }
    
	/**
	 * <code>loadIdentity</code> sets this matrix to the identity matrix. 
	 * Where all values are zero except those along the diagonal which are
	 * one.
	 *
	 */
	public void loadIdentity() {
		matrix[0][1] = matrix[0][2] = matrix[1][0] = matrix[1][2] = matrix[2][0] = matrix[2][1] = 0;
		matrix[0][0] = matrix[1][1] = matrix[2][2] = 1;
	}
	
	/**
	 * <code>multiply</code> multiplies this matrix by a scalar.
	 * @param scalar the scalar to multiply this matrix by.
	 */
	public void multiply(float scalar) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] *= scalar;
			}
		}
	}

    /**
     * <code>mult</code> multiplies this matrix by a given matrix. The
     * result matrix is returned as a new object. If the given matrix is null,
     * a null matrix is returned.
     * @param mat the matrix to multiply this matrix by.
     * @return the result matrix.
     */
    public Matrix3f mult(Matrix3f mat) {
        if (null == mat) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Source matrix is " + "null, null result returned.");
            return null;
        }
        Matrix3f product = new Matrix3f();
        for (int iRow = 0; iRow < 3; iRow++) {
            for (int iCol = 0; iCol < 3; iCol++) {
                product.set(
                    iRow,
                    iCol,
                    matrix[iRow][0] * mat.get(0, iCol)
                        + matrix[iRow][1] * mat.get(1, iCol)
                        + matrix[iRow][2] * mat.get(2, iCol));
            }
        }
        return product;
    }
    
    /**
     * <code>mult</code> multiplies this matrix by a given matrix. The
     * result matrix is returned as a new object. If the given matrix is null,
     * a null matrix is returned.
     * @param mat the matrix to multiply this matrix by.
     * @return the result matrix.
     */
    public void mult(Matrix3f mat, Matrix3f product) {
    	if (null == mat) {
    		LoggingSystem.getLogger().log(
    				Level.WARNING,
					"Source matrix is " + "null, null result returned.");
    		return;
    	}
    	
    	for (int iRow = 0; iRow < 3; iRow++) {
    		for (int iCol = 0; iCol < 3; iCol++) {
    			product.set(
    					iRow,
						iCol,
						matrix[iRow][0] * mat.get(0, iCol)
						+ matrix[iRow][1] * mat.get(1, iCol)
						+ matrix[iRow][2] * mat.get(2, iCol));
    		}
    	}
    }

    /**
     * <code>mult</code> multiplies this matrix by a given <code>Vector3f</code>
     * object. The result vector is returned. If the given vector is null,
     * null will be returned.
     * @param vec the vector to multiply this matrix by.
     * @return the result vector.
     */
    public Vector3f mult(Vector3f vec) {
        if (null == vec) {
            LoggingSystem.getLogger().log(
                Level.WARNING,
                "Source vector is" + " null, null result returned.");
            return null;
        }
        Vector3f product = new Vector3f();
        product.x =
            matrix[0][0] * vec.x + matrix[0][1] * vec.y + matrix[0][2] * vec.z;
        product.y =
            matrix[1][0] * vec.x + matrix[1][1] * vec.y + matrix[1][2] * vec.z;
        product.z =
            matrix[2][0] * vec.x + matrix[2][1] * vec.y + matrix[2][2] * vec.z;

        return product;
    }
    
    public void mult(Vector3f vec, Vector3f product) {
    	if(null == vec) {
    		LoggingSystem.getLogger().log(
    				Level.WARNING,
					"Source vector is" + " null, null result returned.");
    		return;
    	}
    	
    	if(null == product) {
    		product = new Vector3f();
    	}
    	
    	float x = vec.x;
    	float y = vec.y;
    	float z = vec.z;
    	
    	product.x =
    		matrix[0][0] * x + matrix[0][1] * y + matrix[0][2] * z;
    	product.y =
    		matrix[1][0] * x + matrix[1][1] * y + matrix[1][2] * z;
    	product.z =
    		matrix[2][0] * x + matrix[2][1] * y + matrix[2][2] * z;
    	
    }
    
	/**
	 * <code>add</code> adds the values of a parameter matrix to this matrix.
	 * @param matrix the matrix to add to this.
	 */
	public void add(Matrix3f matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.matrix[i][j] += matrix.get(i,j);
			}
		}
	}

    /**
     * 
     * <code>fromAxisAngle</code> creates a rotational matrix given an axis
     * and an angle. The angle is expected to be in radians.
     * @param axis the axis to rotate about.
     * @param radian the angle to rotate.
     */
    public void fromAxisAngle(Vector3f axis, float radian) {
        Vector3f normAxis = axis.normalize();
        float cos = (float)Math.cos(radian);
        float sin = (float)Math.sin(radian);
        float oneMinusCos = 1.0f - cos;
        float x2 = normAxis.x * axis.x;
        float y2 = normAxis.y * axis.y;
        float z2 = normAxis.z * axis.z;
        float xym = normAxis.x * axis.y * oneMinusCos;
        float xzm = normAxis.x * axis.z * oneMinusCos;
        float yzm = normAxis.y * axis.z * oneMinusCos;
        float xSin = normAxis.x * sin;
        float ySin = normAxis.y * sin;
        float zSin = normAxis.z * sin;

        matrix[0][0] = x2 * oneMinusCos + cos;
        matrix[0][1] = xym - zSin;
        matrix[0][2] = xzm + ySin;
        matrix[1][0] = xym + zSin;
        matrix[1][1] = y2 * oneMinusCos + cos;
        matrix[1][2] = yzm - xSin;
        matrix[2][0] = xzm - ySin;
        matrix[2][1] = yzm + xSin;
        matrix[2][2] = z2 * oneMinusCos + cos;
    }
    
    /**
     * <code>toString</code> returns the string representation of this object.
     * It is in a format of a 3x3 matrix. For example, an identity matrix would
     * be represented by the following string.
     * com.jme.math.Matrix3f<br>
     * [<br>
     *   1.0  0.0  0.0 <br>
     *   0.0  1.0  0.0 <br>
     *   0.0  0.0  1.0 <br>
     * ]<br>
     * 
     * @return the string representation of this object.
     */
    public String toString() {
        String result = "com.jme.math.Matrix3f\n[\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result += " " + matrix[i][j] + " ";
            }
            result += "\n";
        }
        result += "]";
        return result;
    }
}
