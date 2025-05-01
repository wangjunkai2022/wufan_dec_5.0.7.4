.class public Lcom/join/mgps/dto/SimulatorRecomBean;
.super Lcom/join/mgps/dto/CollectionBeanSub;
.source "SimulatorRecomBean.java"


# instance fields
.field private simulator_main_rec_pic:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/dto/CollectionBeanSub;-><init>()V

    return-void
.end method


# virtual methods
.method public getSimulator_main_rec_pic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorRecomBean;->simulator_main_rec_pic:Ljava/lang/String;

    return-object v0
.end method

.method public setSimulator_main_rec_pic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorRecomBean;->simulator_main_rec_pic:Ljava/lang/String;

    return-void
.end method
