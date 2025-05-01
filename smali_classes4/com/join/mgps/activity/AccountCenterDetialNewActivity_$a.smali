.class Lcom/join/mgps/activity/AccountCenterDetialNewActivity_$a;
.super Ljava/lang/Object;
.source "AccountCenterDetialNewActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;->f0(Lcom/join/mgps/dto/FavoritesCenterData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/FavoritesCenterData;

.field final synthetic c:Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;Lcom/join/mgps/dto/FavoritesCenterData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/AccountCenterDetialNewActivity_$a;->c:Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/AccountCenterDetialNewActivity_$a;->b:Lcom/join/mgps/dto/FavoritesCenterData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountCenterDetialNewActivity_$a;->c:Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/AccountCenterDetialNewActivity_$a;->b:Lcom/join/mgps/dto/FavoritesCenterData;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;->g0(Lcom/join/mgps/activity/AccountCenterDetialNewActivity_;Lcom/join/mgps/dto/FavoritesCenterData;)V

    return-void
.end method
