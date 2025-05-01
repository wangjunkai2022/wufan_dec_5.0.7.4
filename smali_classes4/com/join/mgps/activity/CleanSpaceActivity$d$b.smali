.class Lcom/join/mgps/activity/CleanSpaceActivity$d$b;
.super Ljava/lang/Object;
.source "CleanSpaceActivity.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CleanSpaceActivity$d;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/CleanSpaceActivity$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

.field final synthetic c:Landroid/widget/CheckBox;

.field final synthetic d:Lcom/join/mgps/activity/CleanSpaceActivity$d;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CleanSpaceActivity$d;Landroid/widget/ImageView;Lcom/join/mgps/activity/CleanSpaceActivity$c;Landroid/widget/CheckBox;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iput-object p2, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    iput-object p4, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->c:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->a:Landroid/widget/ImageView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->k(Z)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->f0(Lcom/join/mgps/activity/CleanSpaceActivity;)I

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->k0(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->c:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->a:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->k(Z)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->g0(Lcom/join/mgps/activity/CleanSpaceActivity;)I

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->b:Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object v0, v0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/CleanSpaceActivity;->A0(Ljava/lang/String;)V

    goto :goto_1

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;->d:Lcom/join/mgps/activity/CleanSpaceActivity$d;

    iget-object p1, p1, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->j0(Lcom/join/mgps/activity/CleanSpaceActivity;)V

    return-void
.end method
