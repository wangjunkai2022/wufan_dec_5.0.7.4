.class public Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter$ContentCollectionHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PaPaListItemDownloadAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ContentCollectionHolder"
.end annotation


# instance fields
.field a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/LinearLayout;

.field final synthetic e:Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter$ContentCollectionHolder;->e:Lcom/join/mgps/adapter/PaPaListItemDownloadAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method
