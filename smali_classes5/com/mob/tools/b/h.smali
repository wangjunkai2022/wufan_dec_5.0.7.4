.class public Lcom/mob/tools/b/h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mob/tools/b/h$a;
    }
.end annotation


# direct methods
.method private static a()Landroid/os/Parcelable$Creator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/os/Parcelable$Creator<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-string v0, "025deBdcdjdkdidcdlPg:dk2cdi=didkRe;dlfedk_cdiRdidk$e"

    .line 44
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/ReflectHelper;->importClass(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "007;edgjgifdfcghgj"

    invoke-static {v1}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mob/tools/utils/ReflectHelper;->getStaticField(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable$Creator;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    const-class v2, Ljava/lang/String;

    invoke-static {}, Lcom/mob/commons/d;->f()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    .line 2
    invoke-static {}, Lcom/mob/tools/utils/f;->a()Lcom/mob/tools/utils/f;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/mob/tools/utils/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    return-object v4

    .line 3
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-ge v3, v5, :cond_1

    return-object v4

    .line 4
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v5

    const/16 v13, 0x1f

    const-string v14, "$"

    const/4 v15, 0x2

    const/4 v12, 0x1

    const/4 v11, 0x0

    if-lt v3, v13, :cond_3

    .line 5
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "036de1dcdjdkdidcdl6gKdkKcdi\'didk+eIdlfeAdNfiNi:fedk<cdiXdidkVe^gjFf(dedg*f5fiLi"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "007]fjdgdiVgOdcCf)dj"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {v5, v6}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "036deXdcdjdkdidcdlKgFdkQcdiYdidk3e0dlfe:dDfi0iNfedkZcdiOdidkHe[gjWfGdedg1fPfiTi"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "007!fjdgdiZgLdcDfOdj"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v6, "005Bffdgdi>g,dc"

    .line 10
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v6, v5

    const/4 v13, 0x0

    move-object/from16 v11, v16

    const/4 v4, 0x1

    move-object/from16 v12, v17

    .line 11
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    const/4 v13, 0x0

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    const/4 v4, 0x1

    const/4 v13, 0x0

    const-string v6, "032deYdcdjdkdidcdl0g<dk3cdiMdidkVeUdlfedk^cdi1didkMe^gjMfUdedgQfBfi[i"

    .line 12
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const-string v6, "028c1djVfdifWgcdjdkdfflYfj$dj!fcdif0dcgldjdkdddidc[fVdj"

    .line 13
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v6, 0x4

    new-array v10, v6, [Ljava/lang/Class;

    aput-object v2, v10, v13

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v11, v10, v4

    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v11, v10, v15

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x3

    aput-object v11, v10, v12

    new-array v11, v6, [Ljava/lang/Object;

    aput-object v0, v11, v13

    .line 14
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v15

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v11, v12

    const/4 v12, 0x0

    move-object v6, v5

    .line 15
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_0
    move-object/from16 v17, v6

    .line 16
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "033deAdcdjdkdidcdlPgUdkYcdi$didk>e:dleefedk@cdi[didk\'e<hcKdedDejQf;dj"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "004Jel(iSdgff"

    .line 17
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "027;fcgjfdegelfdedfceeghegdhejZfiBfeHd9fi4i2fedk%cdiOdidk e"

    .line 18
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, -0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    .line 19
    invoke-virtual {v5, v6, v7, v9, v8}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const-string v6, "025deAdcdjdkdidcdldkfidlel9fTdjdddi$cfEhc(ded ej(f_dj"

    .line 20
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const-string v6, "010AejQfi*el8fJdjdddiYcf"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v4, [Ljava/lang/Class;

    aput-object v2, v10, v13

    new-array v11, v4, [Ljava/lang/Object;

    const-string v2, "008gZdk$cdi7didk)e"

    .line 21
    invoke-static {v2}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v11, v13

    const/4 v12, 0x0

    move-object v6, v5

    .line 22
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/IBinder;

    if-eqz v17, :cond_6

    if-eqz v2, :cond_6

    .line 23
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v12

    .line 24
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v11

    :try_start_0
    const-string v6, "033de0dcdjdkdidcdl$gQdk1cdi>didkOe2dleefedk cdiWdidkHe$hcVdedXejOfPdj"

    .line 25
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/16 v6, 0x1f

    if-lt v3, v6, :cond_4

    .line 26
    invoke-virtual {v12, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    move-object/from16 v0, v17

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v12, v0, v13}, Landroid/os/Parcel;->writeTypedObject(Landroid/os/Parcelable;I)V

    move-object v5, v11

    move-object v15, v12

    goto :goto_1

    .line 28
    :cond_4
    invoke-virtual {v12, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v0, "013_fgdjdiMifWfcdkglCd)dj<cfg"

    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v15, [Ljava/lang/Class;

    const-class v0, Landroid/os/Parcel;

    aput-object v0, v10, v13

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v0, v10, v4

    new-array v0, v15, [Ljava/lang/Object;

    aput-object v12, v0, v13

    .line 30
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x0

    move-object v6, v5

    move-object/from16 v8, v17

    move-object v5, v11

    move-object v11, v0

    move-object v15, v12

    move-object v12, v4

    .line 31
    :try_start_1
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 v0, 0x1e

    if-lt v3, v0, :cond_5

    .line 33
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAttributionTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 34
    :cond_5
    invoke-interface {v2, v14, v15, v5, v13}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 35
    invoke-virtual {v5}, Landroid/os/Parcel;->readException()V

    .line 36
    invoke-static {}, Lcom/mob/tools/b/h;->a()Landroid/os/Parcelable$Creator;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readTypedObject(Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/mob/tools/a/d;->b(Landroid/content/Context;)Z

    .line 38
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 39
    invoke-virtual {v15}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v11

    move-object v15, v12

    .line 40
    :goto_2
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/mob/tools/a/d;->b(Landroid/content/Context;)Z

    .line 41
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 42
    invoke-virtual {v15}, Landroid/os/Parcel;->recycle()V

    .line 43
    throw v0

    :cond_6
    const/4 v0, 0x0

    goto :goto_3

    :cond_7
    move-object v0, v4

    :goto_3
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;J)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 45
    const-class v2, Ljava/lang/String;

    invoke-static {}, Lcom/mob/commons/d;->e()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    .line 46
    invoke-static {}, Lcom/mob/tools/utils/f;->a()Lcom/mob/tools/utils/f;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/mob/tools/utils/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    return-object v4

    .line 47
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-ge v3, v5, :cond_1

    return-object v4

    .line 48
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v5

    .line 49
    new-instance v13, Ljava/util/concurrent/CountDownLatch;

    const/4 v14, 0x1

    invoke-direct {v13, v14}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-array v15, v14, [Ljava/lang/Object;

    const/16 v12, 0x1f

    const/4 v11, 0x3

    const-string v10, "$"

    const/4 v8, 0x0

    if-lt v3, v12, :cond_3

    .line 50
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "032dePdcdjdkdidcdlDgHdkScdiJdidk9e2dlfedkQcdi6didk^e8gjBfGdedg3fEfi0i"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "007Tfjdgdi3gDdc8fWdj"

    .line 51
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v14, [Ljava/lang/Class;

    sget-object v16, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v16, v7, v8

    new-array v9, v14, [Ljava/lang/Object;

    const-wide/16 v17, 0x0

    .line 52
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    aput-object v17, v9, v8

    .line 53
    invoke-virtual {v5, v6, v7, v9}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "032de=dcdjdkdidcdl;g0dkRcdiXdidk3e6dlfedk9cdi4didk9e(gj\'fIdedg$f6fi@i"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "007)fjdgdiKg6dcBf^dj"

    .line 55
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v6, "005Uffdgdi7g_dc"

    .line 56
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v6, v5

    const/4 v4, 0x0

    move-object v8, v9

    move-object/from16 v9, v17

    move-object/from16 v21, v10

    move-object/from16 v10, v18

    move-object/from16 v11, v19

    move-object/from16 v12, v20

    .line 57
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object/from16 v21, v10

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    move-object/from16 v21, v10

    const/4 v4, 0x0

    const-string v6, "032deVdcdjdkdidcdlKg=dkUcdiGdidkTeIdlfedk+cdi+didk[e:gjYfCdedg7f?fiFi"

    .line 58
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v6, "028c;dj\'fdif,gcdjdkdffl)fj+djPfcdif*dcgldjdkdddidc@fEdj"

    .line 59
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v6, 0x4

    new-array v10, v6, [Ljava/lang/Class;

    aput-object v2, v10, v4

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v11, v10, v14

    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x2

    aput-object v11, v10, v12

    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x3

    aput-object v11, v10, v8

    new-array v11, v6, [Ljava/lang/Object;

    aput-object v0, v11, v4

    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v12

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v11, v8

    const/16 v17, 0x0

    move-object v6, v5

    const/4 v8, 0x0

    move-object/from16 v12, v17

    .line 61
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_0
    move-object/from16 v16, v6

    const-string v6, "025de:dcdjdkdidcdldkfidlelNf@djdddiMcf2hc?dedOejYf3dj"

    .line 62
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const-string v6, "010<ej8fiUelHf$djdddi0cf"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v14, [Ljava/lang/Class;

    aput-object v2, v10, v4

    new-array v11, v14, [Ljava/lang/Object;

    const-string v2, "008gQdkQcdiUdidkUe"

    .line 63
    invoke-static {v2}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v11, v4

    const/4 v12, 0x0

    move-object v6, v5

    .line 64
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/IBinder;

    if-eqz v16, :cond_7

    if-eqz v2, :cond_7

    .line 65
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v12

    .line 66
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v11

    :try_start_0
    const-string v6, "033deUdcdjdkdidcdlJg5dk>cdiXdidkYe$dleefedkScdiTdidkWe:hc$ded1ej8fFdj"

    .line 67
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/16 v17, -0x1

    const/16 v6, 0x1f

    if-lt v3, v6, :cond_5

    .line 68
    invoke-virtual {v12, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    move-object/from16 v0, v16

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v12, v0, v4}, Landroid/os/Parcel;->writeTypedObject(Landroid/os/Parcelable;I)V

    .line 70
    new-instance v0, Lcom/mob/tools/b/h$1;

    invoke-direct {v0, v15, v13}, Lcom/mob/tools/b/h$1;-><init>([Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "032deSdcdjdkdidcdl]g-dk^cdiUdidkEeVdlfedkYcdi5didk[e1hcNdedEej5f-dj"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v10, v21

    .line 72
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "027-idMfi0eddgdjdj^fei4fedk4cdiZdidk<eDfcdj9de>fiRjSdkdjKi"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x3

    new-array v6, v9, [Ljava/lang/Class;

    const-class v7, Ljava/util/concurrent/Executor;

    aput-object v7, v6, v4

    const-class v7, Ljava/util/function/Consumer;

    aput-object v7, v6, v14

    const-class v7, Landroid/os/CancellationSignal;

    const/4 v8, 0x2

    aput-object v7, v6, v8

    new-array v7, v9, [Ljava/lang/Object;

    .line 73
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    aput-object v9, v7, v4

    aput-object v0, v7, v14

    const/4 v9, 0x0

    aput-object v9, v7, v8

    .line 74
    invoke-virtual {v5, v3, v6, v7}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 75
    const-class v7, Landroid/app/AppOpsManager;

    const/4 v8, 0x0

    const-string v6, "012i@dkgj$fcfWdiddOf)djeedc"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v6, v14, [Ljava/lang/Class;

    const-class v16, Ljava/lang/Object;

    aput-object v16, v6, v4

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v0, v14, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    const/4 v0, 0x0

    move-object/from16 v16, v6

    move-object v6, v5

    move-object v4, v10

    move-object/from16 v10, v16

    move-object/from16 v22, v11

    move-object v11, v14

    move-object v14, v12

    move-object v12, v0

    :try_start_1
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 76
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 77
    check-cast v3, Landroid/os/IInterface;

    invoke-virtual {v14, v3}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    .line 78
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 79
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAttributionTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v14, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "033de<dcdjdkdidcdl>g@dk<cdiXdidkXeJdleefedkXcdiYdidk7eUhcBded(ejXfSdj"

    invoke-static {v3}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "004(elWi(dgff"

    invoke-static {v3}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "0305fcgjfdegelfdedfceeghegdhej3fiPeddgdjdj<fei,fedk\'cdi_didkBe"

    .line 83
    invoke-static {v3}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x0

    .line 84
    invoke-virtual {v5, v0, v3, v6, v4}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v3, v22

    const/4 v4, 0x0

    .line 85
    :try_start_2
    invoke-interface {v2, v0, v14, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_4
    move-object/from16 v3, v22

    :goto_1
    move-object v6, v14

    const/4 v4, 0x0

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v3, v22

    :goto_2
    move-object v6, v14

    goto/16 :goto_7

    :cond_5
    move-object v3, v11

    move-object/from16 v4, v21

    const/4 v8, 0x2

    const/4 v9, 0x3

    .line 86
    :try_start_3
    invoke-virtual {v12, v14}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v0, "013UfgdjdiKif4fcdkglKd6djTcfg"

    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v10, v8, [Ljava/lang/Class;

    const-class v6, Landroid/os/Parcel;

    const/4 v11, 0x0

    aput-object v6, v10, v11

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v10, v14

    new-array v6, v8, [Ljava/lang/Object;

    aput-object v12, v6, v11

    .line 88
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v6, v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    const/16 v19, 0x0

    move-object v11, v6

    move-object v6, v5

    move-object/from16 v8, v16

    move-object v9, v0

    move-object/from16 v23, v12

    move-object/from16 v12, v19

    .line 89
    :try_start_4
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 91
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    const-string v7, "0177dk)eQfedk7cdi0didk%eCed-hde;ej\'fKdc"

    .line 92
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/mob/tools/b/h$2;

    invoke-direct {v8, v15, v13}, Lcom/mob/tools/b/h$2;-><init>([Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "equals"

    .line 93
    new-instance v8, Lcom/mob/tools/b/h$3;

    invoke-direct {v8, v6}, Lcom/mob/tools/b/h$3;-><init>(I)V

    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "008hd*fiShDeddkdc?f"

    .line 94
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/mob/tools/b/h$4;

    invoke-direct {v8, v6}, Lcom/mob/tools/b/h$4;-><init>(I)V

    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "033deEdcdjdkdidcdlXgEdkWcdiLdidk9e(dlfedk?cdiKdidkKeTfedifi+ifef)dj"

    .line 95
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    new-array v7, v14, [Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    .line 96
    invoke-static {v0, v7}, Lcom/mob/tools/utils/ReflectHelper;->createProxy(Ljava/util/Map;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    .line 97
    :try_start_6
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    .line 98
    :goto_3
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1e

    if-lt v6, v7, :cond_6

    .line 99
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "032deGdcdjdkdidcdl]g5dkUcdiCdidk\'eIdlfedkScdiLdidk$e;hcAded<ej(f%dj"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "025Nfedk3cdiHdidk6e8fedifiZifef^djfcdj%deZfiEjJdkdjOi"

    .line 100
    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Class;

    const-string v9, "032de8dcdjdkdidcdl?gIdk_cdi%didkCe dlfedkJcdi6didk2e=hcVded2ej6f)dj"

    .line 101
    invoke-static {v9}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    const-string v9, "033de?dcdjdkdidcdl@g!dk4cdi>didk@e<dlfedk=cdi+didkTe?fedifi@ifefIdj"

    .line 102
    invoke-static {v9}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aput-object v9, v8, v14

    new-array v7, v7, [Ljava/lang/Object;

    const-string v9, "008g9dk3cdi1didkUe"

    .line 103
    invoke-static {v9}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/mob/tools/utils/DH$SyncMtd;->getSystemServiceSafe(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v7, v10

    aput-object v0, v7, v14

    .line 104
    invoke-virtual {v5, v6, v8, v7}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v6, "008Ydj\'f<ejdifi>if!dj"

    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-array v10, v14, [Ljava/lang/Class;

    const-class v6, Ljava/util/concurrent/Executor;

    const/4 v8, 0x0

    aput-object v6, v10, v8

    new-array v11, v14, [Ljava/lang/Object;

    .line 106
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    aput-object v6, v11, v8

    const/4 v12, 0x0

    move-object v6, v5

    move-object v8, v0

    .line 107
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    const/4 v7, 0x2

    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "032de8dcdjdkdidcdl4g6dk*cdi[didk7e1dlfedk(cdi(didk6eUhc]dedRej_f+dj"

    invoke-static {v8}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "017PfedifiOifef0djfcdj$deIfi)j>dkdjFi"

    .line 109
    invoke-static {v8}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x3

    new-array v9, v8, [Ljava/lang/Class;

    const-string v10, "032de9dcdjdkdidcdl@gOdkUcdi0didk.eIdlfedk cdiLdidkVe=hc[dedKejEfHdj"

    .line 110
    invoke-static {v10}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    const-string v10, "033de\'dcdjdkdidcdlIg\'dkYcdi*didk1eAdlfedk2cdi,didkBeVfedifi_ifef]dj"

    .line 111
    invoke-static {v10}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v9, v14

    const-class v10, Landroid/os/Looper;

    aput-object v10, v9, v7

    new-array v8, v8, [Ljava/lang/Object;

    const-string v10, "008g3dk]cdi)didkLe"

    .line 112
    invoke-static {v10}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/mob/tools/utils/DH$SyncMtd;->getSystemServiceSafe(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v8, v11

    aput-object v0, v8, v14

    invoke-static {}, Lcom/mob/commons/a/l;->a()Lcom/mob/commons/a/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/commons/a/l;->c()Landroid/os/Looper;

    move-result-object v0

    aput-object v0, v8, v7

    .line 113
    invoke-virtual {v5, v6, v9, v8}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 114
    :goto_4
    check-cast v0, Landroid/os/IBinder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-object/from16 v6, v23

    :try_start_7
    invoke-virtual {v6, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v7, 0x0

    .line 115
    invoke-virtual {v6, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v7, "033deYdcdjdkdidcdl*g?dk1cdi3didk(eJdleefedk>cdiEdidkKe0hc!dedSej*fSdj"

    invoke-static {v7}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "0045el]i@dgff"

    invoke-static {v4}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "034Afcgjfdegelfdedfceeghegdhdj1fNdedgVf2fiPi6fedkLcdi<didkTeAek+jCdcBdifDfi"

    .line 119
    invoke-static {v4}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    .line 120
    invoke-virtual {v5, v0, v4, v8, v7}, Lcom/mob/tools/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v4, 0x0

    .line 121
    invoke-interface {v2, v0, v6, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 122
    :goto_5
    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V

    .line 123
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v7, p2

    invoke-virtual {v13, v7, v8, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 124
    aget-object v0, v15, v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 125
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 126
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 127
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/mob/tools/a/d;->b(Landroid/content/Context;)Z

    return-object v0

    :catchall_3
    move-exception v0

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object/from16 v6, v23

    goto :goto_7

    :catchall_5
    move-exception v0

    goto :goto_6

    :catchall_6
    move-exception v0

    move-object v3, v11

    :goto_6
    move-object v6, v12

    .line 128
    :goto_7
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 129
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 130
    invoke-static/range {p0 .. p0}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/mob/tools/a/d;->b(Landroid/content/Context;)Z

    .line 131
    throw v0

    :cond_7
    const/4 v1, 0x0

    goto :goto_8

    :cond_8
    move-object v1, v4

    :goto_8
    return-object v1
.end method
