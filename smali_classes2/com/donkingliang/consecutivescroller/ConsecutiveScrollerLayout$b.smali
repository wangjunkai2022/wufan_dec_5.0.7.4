.class Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;
.super Ljava/lang/Object;
.source "ConsecutiveScrollerLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic c:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;


# direct methods
.method constructor <init>(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;->c:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    iput-object p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/donkingliang/consecutivescroller/c;->y(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
