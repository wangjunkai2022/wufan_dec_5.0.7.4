.class Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$c;
.super Ljava/lang/Object;
.source "ConsecutiveScrollerLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;


# direct methods
.method constructor <init>(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$c;->b:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$c;->b:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->a(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;ZZ)V

    return-void
.end method
