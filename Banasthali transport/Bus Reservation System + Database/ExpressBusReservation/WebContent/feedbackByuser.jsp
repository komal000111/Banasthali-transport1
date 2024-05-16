<%@page import="com.cognizant.model.BusModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>

<!-- ***********   START   *********** -->
<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>



<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12 col-lg-offset-2">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            FEEDBACK
        </div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg);
                }
            %>
        </div>


        <!--User Registration-->
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="feedbackByuser" action="Feedbackcontroller"
                  method="post">


                <div class="form-group">
                    <label for="username">Email ID</label> 
                    <input type="text" name="username" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="address">message</label> 
                    <textarea name="address" class="form-control" rows="3"></textarea>
                </div>
                <div class="form-group">
                   &emsp;&emsp;&emsp; &emsp;&emsp;&emsp;<button type="submit" class="btn btn-success">Submit</button>&emsp;&emsp;&emsp;
                    <button type="reset" class="btn btn-warning">Reset</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- ********************************* -->
<jsp:include page="layout/Footer.jsp" />