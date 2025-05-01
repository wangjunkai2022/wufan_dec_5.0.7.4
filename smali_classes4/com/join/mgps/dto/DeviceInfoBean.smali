.class public Lcom/join/mgps/dto/DeviceInfoBean;
.super Ljava/lang/Object;
.source "DeviceInfoBean.java"


# instance fields
.field private android_ver:Ljava/lang/Integer;

.field private mobile_phone_model:Ljava/lang/String;

.field private os_sys:Ljava/lang/String;

.field private ui_ver:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAndroid_ver()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DeviceInfoBean;->android_ver:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMobile_phone_model()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DeviceInfoBean;->mobile_phone_model:Ljava/lang/String;

    return-object v0
.end method

.method public getOs_sys()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DeviceInfoBean;->os_sys:Ljava/lang/String;

    return-object v0
.end method

.method public getUi_ver()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/DeviceInfoBean;->ui_ver:Ljava/lang/String;

    return-object v0
.end method

.method public setAndroid_ver(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DeviceInfoBean;->android_ver:Ljava/lang/Integer;

    return-void
.end method

.method public setMobile_phone_model(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DeviceInfoBean;->mobile_phone_model:Ljava/lang/String;

    return-void
.end method

.method public setOs_sys(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DeviceInfoBean;->os_sys:Ljava/lang/String;

    return-void
.end method

.method public setUi_ver(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/DeviceInfoBean;->ui_ver:Ljava/lang/String;

    return-void
.end method
